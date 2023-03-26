public class HolidayArray {
    private Holiday[] array;

    public Holiday[] getHolidayArray() {
        return array;
    }

    public HolidayArray(Holiday[] array) {
        this.array = array;
    }

    public String verifyDate(String date) {
        for (int i = 0; i < array.length; i++) {
            if (date.equals(array[i].showDate())) {
                return array[i].showName();
            }
        }

        return "Essa data não é um feriado!";
    }
}
