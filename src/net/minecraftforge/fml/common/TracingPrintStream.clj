(ns net.minecraftforge.fml.common.TracingPrintStream
  "PrintStream which redirects it's output to a given logger."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common TracingPrintStream]))

(defn ->tracing-print-stream
  "Constructor.

  logger - `org.apache.logging.log4j.Logger`
  original - `java.io.PrintStream`"
  (^TracingPrintStream [^org.apache.logging.log4j.Logger logger ^java.io.PrintStream original]
    (new TracingPrintStream logger original)))

(defn println
  "o - `java.lang.Object`"
  ([^TracingPrintStream this ^java.lang.Object o]
    (-> this (.println o))))

