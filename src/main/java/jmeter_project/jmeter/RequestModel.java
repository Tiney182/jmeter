package jmeter_project.jmeter;

public class RequestModel {
  public Integer timeStamp;
  public Integer elapsed;
  public String label;
  public Integer responseCode;
  public String responseMessage;
  public String threadName;
  public String dataType;
  public String success;
  public String failureMessage;
  public Integer bytes;
  public Integer sentBytes;
  public Integer grpThreads;
  public Integer allThreads;
  public Integer latency;
  public Integer idleTime;
  public Integer connect;

  public Integer getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Integer timeStamp) {
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

  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
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
