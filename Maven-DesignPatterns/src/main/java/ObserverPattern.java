import java.util.*;

public class ObserverPattern {

        static class SachinCenturyNotifier {
            List<SachinFan> fans = new ArrayList<SachinFan>();

            

            void register(SachinFan fan) {

                fans.add(fan);

            } 


            void sachinScoredACentury() {

                for(SachinFan fan: fans) {

                    fan.announce();

                }

            }

        }


        static class SachinFan {

            private String name;

            

            SachinFan(String name) {

                this.name = name;

            }


            void announce() {

                System.out.println(name + " notified");
            }

        }


        public static void main(String[] args) {

            SachinCenturyNotifier notifier = new SachinCenturyNotifier();

            notifier.register(new SachinFan("Ranga"));

            notifier.register(new SachinFan("Ramya"));

            notifier.register(new SachinFan("Veena"));

            notifier.sachinScoredACentury();

        }

    }
