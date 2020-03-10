
public class StrategyPattern {

        interface Sortable {

            public int[] sort(int[] numbers);

        }


        static class BubbleSort implements Sortable {


            public int[] sort(int[] numbers) {

                //sort using bubble sort algorithm


                return numbers;

            }

        }


        static class QuickSort implements Sortable {

            public int[] sort(int[] numbers) { 

                //sort using quicksort algorithm


                return numbers;

            }

        }


        static class ComplexClass {

            private Sortable sorter;


            ComplexClass(Sortable sorter) {

                this.sorter = sorter;

            }


            void doAComplexThing() {

                int[] values = null;


                //logic...


                sorter.sort(values);


                //logic...

            }

        }


        public static void main(String[] args) {

            ComplexClass complexClassInstance = new ComplexClass(new BubbleSort());

            complexClassInstance.doAComplexThing();

        }

    }
