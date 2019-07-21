(ns net.minecraftforge.server.console.TerminalConsoleAppender
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.console TerminalConsoleAppender]))

(defn *get-reader
  "returns: `jline.console.ConsoleReader`"
  (^jline.console.ConsoleReader []
    (TerminalConsoleAppender/getReader )))

(defn *set-formatter
  "format - `com.google.common.base.Function`"
  ([^com.google.common.base.Function format]
    (TerminalConsoleAppender/setFormatter format)))

(defn *create-appender
  "name - `java.lang.String`
  filter - `org.apache.logging.log4j.core.Filter`
  layout - `org.apache.logging.log4j.core.Layout`
  ignore - `java.lang.String`

  returns: `net.minecraftforge.server.console.TerminalConsoleAppender`"
  (^net.minecraftforge.server.console.TerminalConsoleAppender [^java.lang.String name ^org.apache.logging.log4j.core.Filter filter ^org.apache.logging.log4j.core.Layout layout ^java.lang.String ignore]
    (TerminalConsoleAppender/createAppender name filter layout ignore)))

(defn start
  ""
  ([^TerminalConsoleAppender this]
    (-> this (.start))))

(defn append
  "event - `org.apache.logging.log4j.core.LogEvent`"
  ([^TerminalConsoleAppender this ^org.apache.logging.log4j.core.LogEvent event]
    (-> this (.append event))))

