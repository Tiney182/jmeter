package jmeter_project.jmeter;

public enum Headers {
  TIMESTAMP("0"),
  ELAPSED("1"),
  LABEL("2"),
  RESPONSECODE("3"),
  RESPONSEMESSAGE("4"),
  THREADNAME("5"),
  DATATYPE("6"),
  SUCCESS("7"),
  FAILUREMESSAGE("8"),
  BYTES("9"),
  SENT_BYTES("10"),
  GRP_THREADS("11"),
  ALLTHREADS("12"),
  LATENCY("13"),
  IDLETIME("14"),
  CONNECT("15");

  private String code;

  Headers(String url) {
      this.code = url;
  }

  public Integer getCode() {
      return Integer.parseInt(code);
  }
}
