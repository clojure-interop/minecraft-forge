(ns net.minecraft.util.LoggingPrintStream
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util LoggingPrintStream]))

(defn ->logging-print-stream
  "Constructor.

  domain-in - `java.lang.String`
  out-stream - `java.io.OutputStream`"
  (^LoggingPrintStream [^java.lang.String domain-in ^java.io.OutputStream out-stream]
    (new LoggingPrintStream domain-in out-stream)))

(defn println
  "p-println-1 - `java.lang.String`"
  ([^LoggingPrintStream this ^java.lang.String p-println-1]
    (-> this (.println p-println-1))))

