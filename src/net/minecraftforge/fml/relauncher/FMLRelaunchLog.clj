(ns net.minecraftforge.fml.relauncher.FMLRelaunchLog
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FMLRelaunchLog]))

(def *-log
  "Static Constant.

  Our special logger for logging issues to. We copy various assets from the
   Minecraft logger to achieve a similar appearance.

  type: net.minecraftforge.fml.relauncher.FMLRelaunchLog"
  FMLRelaunchLog/log)

(defn *log
  "target-log - `java.lang.String`
  level - `org.apache.logging.log4j.Level`
  ex - `java.lang.Throwable`
  format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String target-log ^org.apache.logging.log4j.Level level ^java.lang.Throwable ex ^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/log target-log level ex format data))
  ([^java.lang.String target-log ^org.apache.logging.log4j.Level level ^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/log target-log level format data))
  ([^org.apache.logging.log4j.Level level ^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/log level format data)))

(defn *severe
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/severe format data)))

(defn *warning
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/warning format data)))

(defn *info
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/info format data)))

(defn *fine
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/fine format data)))

(defn *finer
  "format - `java.lang.String`
  data - `java.lang.Object`"
  ([^java.lang.String format ^java.lang.Object data]
    (FMLRelaunchLog/finer format data)))

(defn get-logger
  "returns: `org.apache.logging.log4j.Logger`"
  (^org.apache.logging.log4j.Logger [^FMLRelaunchLog this]
    (-> this (.getLogger))))

