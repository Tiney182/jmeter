package jmeter_project.jmeter;

import java.math.BigDecimal;

public class RequestModel {
  private BigDecimal timeStamp;
  private Integer elapsed;
  private String label;
  private String responseCode;
  private String responseMessage;
  private String threadName;
  private String dataType;
  private String success;
  private String failureMessage;
  private Integer bytes;
  private Integer sentBytes;
  private Integer grpThreads;
  private Integer allThreads;
  private Integer latency;
  private Integer idleTime;
  private Integer connect;

  public BigDecimal getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(BigDecimal timeStamp) {
    this.timeStamp = timeStamp;
  }

  public Integer getElapsed() {
    return elapsed;
  }

  public void setElapsed(Integer elapsed) {
    this.elapsed = elapsed;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public String getThreadName() {
    return threadName;
  }

  public void setThreadName(String threadName) {
    this.threadName = threadName;
  }

  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public String getSuccess() {
    return success;
  }

  public void setSuccess(String success) {
    this.success = success;
  }

  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  public Integer getBytes() {
    return bytes;
  }

  public void setBytes(Integer bytes) {
    this.bytes = bytes;
  }

  public Integer getSentBytes() {
    return sentBytes;
  }

  public void setSentBytes(Integer sentBytes) {
    this.sentBytes = sentBytes;
  }

  public Integer getGrpThreads() {
    return grpThreads;
  }

  public void setGrpThreads(Integer grpThreads) {
    this.grpThreads = grpThreads;
  }

  public Integer getAllThreads() {
    return allThreads;
  }

  public void setAllThreads(Integer allThreads) {
    this.allThreads = allThreads;
  }

  public Integer getLatency() {
    return latency;
  }

  public void setLatency(Integer latency) {
    this.latency = latency;
  }

  public Integer getIdleTime() {
    return idleTime;
  }

  public void setIdleTime(Integer idleTime) {
    this.idleTime = idleTime;
  }

  public Integer getConnect() {
    return connect;
  }

  public void setConnect(Integer connect) {
    this.connect = connect;
  }
}
