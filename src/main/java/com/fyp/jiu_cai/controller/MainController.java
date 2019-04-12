package com.fyp.jiu_cai.controller;

import com.fyp.jiu_cai.common.HbasePool;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

import java.io.IOException;

public class MainController {

    public  String get (){
        Configuration configuration =HBaseConfiguration.create();
        configuration.set("hbase.master.info.bindAddress","47.95.15.154");

        configuration.set("hbase.regionserver.info.bindAddres","47.95.15.154");

        Connection connection=null;
        Admin admin=null;
        try {
             connection =ConnectionFactory.createConnection(configuration);
            admin = connection.getAdmin();
            TableName tableName =TableName.valueOf("test");
            Table table = connection.getTable(tableName);
            Scan scan = new Scan();
            scan.addColumn("".getBytes(),"".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }






















        return  "";
    }
}
