import static org.junit.Assert.assertEquals;

public class StateMachine {
    public static void main(String[] args) {
        LeaveResquest state = LeaveResquest.SUBMITTED;
        state = state.nextState();
        assertEquals(LeaveResquest.ESCALATED, state);
        assertEquals("Team Leader", state.responsiblePerson());
    }

    // create state in enum
    public enum LeaveResquest {
        SUBMITTED {

            @Override
            public String responsiblePerson() {
                return "Employee";
            }

            @Override
            public LeaveResquest nextState() {
                return ESCALATED;
            }
        },
        ESCALATED {
            @Override
            public String responsiblePerson() {
                return "Team Leader";
            }

            @Override
            public LeaveResquest nextState() {
                return APPROVED;
            }
        },
        APPROVED {
            @Override
            public String responsiblePerson() {
                return "Department Manager";
            }

            @Override
            public LeaveResquest nextState() {
                return this;
            }
        };

        public abstract String responsiblePerson();
        public abstract LeaveResquest nextState();
    }

}
