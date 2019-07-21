(ns net.minecraftforge.fml.common.discovery.asm.ModAnnotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ModAnnotation]))

(defn ->mod-annotation
  "Constructor.

  type - `net.minecraftforge.fml.common.discovery.asm.ASMModParser.AnnotationType`
  asm-type - `org.objectweb.asm.Type`
  member - `java.lang.String`"
  (^ModAnnotation [^net.minecraftforge.fml.common.discovery.asm.ASMModParser.AnnotationType type ^org.objectweb.asm.Type asm-type ^java.lang.String member]
    (new ModAnnotation type asm-type member)))

(defn get-type
  "returns: `net.minecraftforge.fml.common.discovery.asm.ASMModParser.AnnotationType`"
  (^net.minecraftforge.fml.common.discovery.asm.ASMModParser.AnnotationType [^ModAnnotation this]
    (-> this (.getType))))

(defn get-values
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^ModAnnotation this]
    (-> this (.getValues))))

(defn add-child-annotation
  "name - `java.lang.String`
  desc - `java.lang.String`

  returns: `net.minecraftforge.fml.common.discovery.asm.ModAnnotation`"
  (^net.minecraftforge.fml.common.discovery.asm.ModAnnotation [^ModAnnotation this ^java.lang.String name ^java.lang.String desc]
    (-> this (.addChildAnnotation name desc))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ModAnnotation this]
    (-> this (.toString))))

(defn end-array
  ""
  ([^ModAnnotation this]
    (-> this (.endArray))))

(defn add-property
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^ModAnnotation this ^java.lang.String key ^java.lang.Object value]
    (-> this (.addProperty key value))))

(defn get-asm-type
  "returns: `org.objectweb.asm.Type`"
  (^org.objectweb.asm.Type [^ModAnnotation this]
    (-> this (.getASMType))))

(defn get-member
  "returns: `java.lang.String`"
  (^java.lang.String [^ModAnnotation this]
    (-> this (.getMember))))

(defn add-array
  "name - `java.lang.String`"
  ([^ModAnnotation this ^java.lang.String name]
    (-> this (.addArray name))))

(defn add-enum-property
  "key - `java.lang.String`
  enum-name - `java.lang.String`
  value - `java.lang.String`"
  ([^ModAnnotation this ^java.lang.String key ^java.lang.String enum-name ^java.lang.String value]
    (-> this (.addEnumProperty key enum-name value))))

