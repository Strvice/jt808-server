package org.yzh.web.entity;

import org.yzh.commons.util.CoordTransform;
import org.yzh.protocol.t808.T0200;

import java.util.Map;

public class T0200Entity {
    public T0200Entity() {
        super();
    }

    public T0200Entity(T0200 t0200) {
        warnBit = t0200.getWarnBit();
        statusBit = t0200.getStatusBit();

        /**
         *经度
         */
        Double longitudeD=t0200.getLongitude()/1000000d;
        /**
         * 纬度
         */
        Double latitudeD=t0200.getLatitude()/1000000d;
        double[] d={longitudeD,latitudeD};
        double[] coordTransform= CoordTransform.wgs84togcj02(d);
        latitude = coordTransform[0];
        longitude = coordTransform[1];

        altitude = t0200.getAltitude();
        speed = t0200.getSpeed();
        direction = t0200.getDirection();
        dateTime = t0200.getDateTime();
        attributes = t0200.getAttributes();
        messageId = t0200.getMessageId();
        properties = t0200.getProperties();
        protocolVersion = t0200.getProtocolVersion();
        clientId = t0200.getClientId();
        serialNo = t0200.getSerialNo();
        packageTotal = t0200.getPackageTotal();
        packageNo = t0200.getPackageNo();
    }

    /**
     * 报警标志
     */
    private int warnBit;
    /**
     * 状态
     */
    private int statusBit;
    /**
     * 纬度
     */
    private double latitude;
    /**
     * 经度
     */
    private double longitude;
    /**
     * 高程(米)
     */
    private int altitude;
    /**
     * 速度(1/10公里每小时)
     */
    private int speed;
    /**
     * 方向
     */
    private int direction;
    /**
     * 时间(YYMMDDHHMMSS)
     */
    private String dateTime;
    /**
     * 位置附加信息
     */
    private Map<Integer, Object> attributes;
    /**
     * 消息ID
     */
    protected int messageId;
    /**
     * 消息体属性
     */
    protected int properties;
    /**
     * 协议版本号
     */
    protected int protocolVersion;
    /**
     * 终端手机号
     */
    protected String clientId;
    /**
     * 流水号
     */
    protected int serialNo;
    /**
     * 消息包总数
     */
    protected Integer packageTotal;
    /**
     * 包序号
     */
    protected Integer packageNo;

    public int getWarnBit() {
        return warnBit;
    }

    public void setWarnBit(int warnBit) {
        this.warnBit = warnBit;
    }

    public int getStatusBit() {
        return statusBit;
    }

    public void setStatusBit(int statusBit) {
        this.statusBit = statusBit;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Map<Integer, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<Integer, Object> attributes) {
        this.attributes = attributes;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getProperties() {
        return properties;
    }

    public void setProperties(int properties) {
        this.properties = properties;
    }

    public int getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getPackageTotal() {
        return packageTotal;
    }

    public void setPackageTotal(Integer packageTotal) {
        this.packageTotal = packageTotal;
    }

    public Integer getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(Integer packageNo) {
        this.packageNo = packageNo;
    }
}
