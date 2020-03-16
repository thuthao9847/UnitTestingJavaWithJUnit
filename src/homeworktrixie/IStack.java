/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktrixie;

/**
 *
 * @author ThuThao
 */
public interface IStack {
    public boolean isEmpty();
    public void push(int data);
    public int pop();
    public int peek();
    public void clear();
    public boolean contain(int data);
}
