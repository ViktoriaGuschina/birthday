public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        FormData formData = new FormData();
        formData.day = 13;
        formData.month = 6;
        formData.year = 1999;
        post.formData = formData;
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
