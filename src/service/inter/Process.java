/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.inter;

/**
 *
 * @author admin
 */
public interface Process {

    public abstract void processLogic();

    public default void process() {
        processLogic();
    }
}
