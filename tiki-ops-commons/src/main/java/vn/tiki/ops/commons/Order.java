package vn.tiki.ops.commons;

public interface Order {

    OrderId getId();

    OrderState getState();
}
