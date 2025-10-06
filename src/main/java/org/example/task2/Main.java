package org.example.task2;

public class Main {
    public static void main(String[] args) {

        Box box = new Box(16.5, 7.0, 10.8);
        System.out.println("=== Інформація про коробку ===");
        System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
        System.out.println("Повна площа поверхні: " + box.getSurfaceArea());
        System.out.println("Об'єм: " + box.getVolume());

        Cart cart = new Cart(10);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println("\n=== Поточний кошик ===");
        System.out.println(cart);

        System.out.println("\n=== Тест розширення кошика ===");
        cart.add(new Item(11, "Apple AirPods Pro", 10999));
        System.out.println("Після додавання 11-го елемента:");
        System.out.println(cart);

        System.out.println("\n=== Видалення товару з ID 9 ===");
        cart.removeItemById(9);
        System.out.println("Після видалення:");
        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println("\n=== Рахунок замовлення ===");
        System.out.println(bill);

        IntStack stack = new IntStack();
        System.out.println("\n=== Тестування стека ===");
        System.out.println("Порожній? " + stack.isEmpty());
        System.out.println("Розмір: " + stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Після додавання 10, 20, 30 → Розмір: " + stack.size());
        System.out.println("Верхній елемент: " + stack.peek());

        System.out.println("Видаляємо верхній елемент: " + stack.pop());
        System.out.println("Новий верхній: " + stack.peek());
        System.out.println("Поточний розмір: " + stack.size());

        System.out.println("\nДодаємо 25 елементів для перевірки resize()");
        for (int i = 0; i < 25; i++) {
            stack.push(100 + i);
        }
        System.out.println("Розмір після додавання: " + stack.size());
        System.out.println("Верхній елемент: " + stack.peek());

        System.out.println("\nОчищення стека...");
        stack.clear();
        System.out.println("Порожній? " + stack.isEmpty());
        System.out.println("Розмір після очищення: " + stack.size());
    }
}