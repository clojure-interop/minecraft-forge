(ns net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery ASMDataTable$ASMData]))

(defn ->asm-data
  "Constructor.

  candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`
  annotation-name - `java.lang.String`
  class-name - `java.lang.String`
  object-name - `java.lang.String`
  info - `java.util.Map`"
  (^ASMDataTable$ASMData [^net.minecraftforge.fml.common.discovery.ModCandidate candidate ^java.lang.String annotation-name ^java.lang.String class-name ^java.lang.String object-name ^java.util.Map info]
    (new ASMDataTable$ASMData candidate annotation-name class-name object-name info)))

(defn get-candidate
  "returns: `net.minecraftforge.fml.common.discovery.ModCandidate`"
  (^net.minecraftforge.fml.common.discovery.ModCandidate [^ASMDataTable$ASMData this]
    (-> this (.getCandidate))))

(defn get-annotation-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMDataTable$ASMData this]
    (-> this (.getAnnotationName))))

(defn get-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMDataTable$ASMData this]
    (-> this (.getClassName))))

(defn get-object-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMDataTable$ASMData this]
    (-> this (.getObjectName))))

(defn get-annotation-info
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^ASMDataTable$ASMData this]
    (-> this (.getAnnotationInfo))))

(defn copy
  "new-annotation-info - `java.util.Map`

  returns: `net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData`"
  (^net.minecraftforge.fml.common.discovery.ASMDataTable$ASMData [^ASMDataTable$ASMData this ^java.util.Map new-annotation-info]
    (-> this (.copy new-annotation-info))))

