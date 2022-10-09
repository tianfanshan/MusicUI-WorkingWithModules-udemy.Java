module academy.learnprograming.common {
    requires javafx.base;

    exports academy.learnprogramming.common;
    opens academy.learnprogramming.common to javafx.base;
}