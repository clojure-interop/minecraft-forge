(ns net.minecraftforge.fml.common.FMLLog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common FMLLog]))

(defn ->fml-log
  "Constructor."
  (^FMLLog []
    (new FMLLog )))

(defn *log
  "target-log - `java.lang.String`
  level - `org.apache.logging.log4j.Level`
  ex - `java.lang.Throwable`
  format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String target-log ^org.apache.logging.log4j.Level level ^java.lang.Throwable ex ^java.lang.String format ^java.lang.Object data]
    (FMLLog/log target-log level ex format data))
  ([^java.lang.String target-log ^org.apache.logging.log4j.Level level ^java.lang.String format ^java.lang.Object data]
    (FMLLog/log target-log level format data))
  ([^org.apache.logging.log4j.Level level ^java.lang.String format ^java.lang.Object data]
    (FMLLog/log level format data)))

(defn *severe
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/severe format data)))

(defn *big-warning
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/bigWarning format data)))

(defn *warning
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/warning format data)))

(defn *info
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/info format data)))

(defn *fine
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/fine format data)))

(defn *finer
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLLog/finer format data)))

(defn *get-logger
  "returns: `org.apache.logging.log4j.Logger`"
  (^org.apache.logging.log4j.Logger []
    (FMLLog/getLogger )))

