/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author th4tkh13m
 */
public class Producer {
    private int producerId;
    private String producerName;

    public Producer(int producerId, String producerName) {
        this.producerId = producerId;
        this.producerName = producerName;
    }

    public int getProducerId() {
        return producerId;
    }

    public String getProducerName() {
        return producerName;
    }
    
    
}
