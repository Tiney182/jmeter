package jmeter_project.jmeter;

public enum RequestHeaders {
  TIME_STAMP("0"),
  ELAPSED("1"),
  LABEL("2"),
  RESPONSE_CODE("3"),
  RESPONSE_MESSAGE("4"),
  THREAD_NAME("5"),
  DATA_TYPE("6"),
  SUCCESS("7"),
  FAILURE_MESSAGE("8"),
  BYTES("9"),
  SENT_BYTES("10"),
  GRP_THREADS("11"),
  ALL_THREADS("12"),
  LATENCY("13"),
  IDLE_TIME("14"),
  CONNECT("15");

  private String code;

  RequestHeaders(String url) {
      this.code = url;
  }

  public Integer getCode() {
      return Integer.parseInt(code);
  }
}
