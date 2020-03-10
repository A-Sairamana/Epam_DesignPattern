

public class StatePattern {

		static class FanWallControl {

            private speedLevel current;

    

            public FanWallControl() {

                current = new Off();

            }


            public void set_state(speedLevel speedLevel3) {

                current = speedLevel3;

            }

    

            public void rotate() {

                current.rotate(this);

            }


            @Override

            public String toString() {

                return String.format("Fan Wall Control [current = %s]", current);

            }

        }


        interface speedLevel {

            void rotate(FanWallControl fanWallControl);

        }

    

         static class Off implements speedLevel {

            public void rotate(FanWallControl fanWallControl) {

                fanWallControl.set_state(new SpeedLevel1());

            }

        }

    

        static class SpeedLevel1 implements speedLevel {

            public void rotate(FanWallControl fanWallControl) {

                fanWallControl.set_state(new SpeedLevel2());

            }

        }

    

        static class SpeedLevel2 implements speedLevel {

            public void rotate(FanWallControl fanWallControl) {

                fanWallControl.set_state(new SpeedLevel3());

            }

        }

    

        static class SpeedLevel3 implements speedLevel {

            public void rotate(FanWallControl fanWallControl) {

                fanWallControl.set_state(new Off());

            }
        }

    }