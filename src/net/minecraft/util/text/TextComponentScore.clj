(ns net.minecraft.util.text.TextComponentScore
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentScore]))

(defn ->text-component-score
  "Constructor.

  name-in - `java.lang.String`
  objective-in - `java.lang.String`"
  (^TextComponentScore [^java.lang.String name-in ^java.lang.String objective-in]
    (new TextComponentScore name-in objective-in)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentScore this]
    (-> this (.getName))))

(defn get-objective
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentScore this]
    (-> this (.getObjective))))

(defn set-value
  "value-in - `java.lang.String`"
  ([^TextComponentScore this ^java.lang.String value-in]
    (-> this (.setValue value-in))))

(defn get-unformatted-component-text
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentScore this]
    (-> this (.getUnformattedComponentText))))

(defn resolve
  "sender - `net.minecraft.command.ICommandSender`"
  ([^TextComponentScore this ^net.minecraft.command.ICommandSender sender]
    (-> this (.resolve sender))))

(defn create-copy
  "returns: `net.minecraft.util.text.TextComponentScore`"
  (^net.minecraft.util.text.TextComponentScore [^TextComponentScore this]
    (-> this (.createCopy))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TextComponentScore this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextComponentScore this]
    (-> this (.toString))))

