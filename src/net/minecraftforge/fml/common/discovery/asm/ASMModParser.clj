(ns net.minecraftforge.fml.common.discovery.asm.ASMModParser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.discovery.asm ASMModParser]))

(defn ->asm-mod-parser
  "Constructor.

  stream - `java.io.InputStream`

  throws: java.io.IOException"
  (^ASMModParser [^java.io.InputStream stream]
    (new ASMModParser stream)))

(defn set-base-mod-properties
  "found-properties - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String found-properties]
    (-> this (.setBaseModProperties found-properties))))

(defn get-asm-super-type
  "returns: `org.objectweb.asm.Type`"
  (^org.objectweb.asm.Type [^ASMModParser this]
    (-> this (.getASMSuperType))))

(defn add-annotation-array
  "name - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String name]
    (-> this (.addAnnotationArray name))))

(defn send-to-table
  "table - `net.minecraftforge.fml.common.discovery.ASMDataTable`
  candidate - `net.minecraftforge.fml.common.discovery.ModCandidate`"
  ([^ASMModParser this ^net.minecraftforge.fml.common.discovery.ASMDataTable table ^net.minecraftforge.fml.common.discovery.ModCandidate candidate]
    (-> this (.sendToTable table candidate))))

(defn add-sub-annotation
  "name - `java.lang.String`
  desc - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String name ^java.lang.String desc]
    (-> this (.addSubAnnotation name desc))))

(defn validate
  ""
  ([^ASMModParser this]
    (-> this (.validate))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMModParser this]
    (-> this (.toString))))

(defn begin-new-type-name
  "type-q-name - `java.lang.String`
  class-version - `int`
  super-class-q-name - `java.lang.String`
  interfaces - `java.lang.String[]`"
  ([^ASMModParser this ^java.lang.String type-q-name ^Integer class-version ^java.lang.String super-class-q-name interfaces]
    (-> this (.beginNewTypeName type-q-name class-version super-class-q-name interfaces))))

(defn get-annotations
  "returns: `java.util.LinkedList<net.minecraftforge.fml.common.discovery.asm.ModAnnotation>`"
  (^java.util.LinkedList [^ASMModParser this]
    (-> this (.getAnnotations))))

(defn get-class-version
  "returns: `int`"
  (^Integer [^ASMModParser this]
    (-> this (.getClassVersion))))

(defn get-base-mod-properties
  "returns: `java.lang.String`"
  (^java.lang.String [^ASMModParser this]
    (-> this (.getBaseModProperties))))

(defn add-annotation-enum-property
  "name - `java.lang.String`
  desc - `java.lang.String`
  value - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String name ^java.lang.String desc ^java.lang.String value]
    (-> this (.addAnnotationEnumProperty name desc value))))

(defn start-method-annotation
  "method-name - `java.lang.String`
  method-descriptor - `java.lang.String`
  annotation-name - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String method-name ^java.lang.String method-descriptor ^java.lang.String annotation-name]
    (-> this (.startMethodAnnotation method-name method-descriptor annotation-name))))

(defn add-annotation-property
  "key - `java.lang.String`
  value - `java.lang.Object`"
  ([^ASMModParser this ^java.lang.String key ^java.lang.Object value]
    (-> this (.addAnnotationProperty key value))))

(defn end-array
  ""
  ([^ASMModParser this]
    (-> this (.endArray))))

(defn base-mod?
  "remembered-types - `java.util.List`

  returns: `boolean`"
  (^Boolean [^ASMModParser this ^java.util.List remembered-types]
    (-> this (.isBaseMod remembered-types))))

(defn get-asm-type
  "returns: `org.objectweb.asm.Type`"
  (^org.objectweb.asm.Type [^ASMModParser this]
    (-> this (.getASMType))))

(defn start-class-annotation
  "annotation-name - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String annotation-name]
    (-> this (.startClassAnnotation annotation-name))))

(defn start-field-annotation
  "field-name - `java.lang.String`
  annotation-name - `java.lang.String`"
  ([^ASMModParser this ^java.lang.String field-name ^java.lang.String annotation-name]
    (-> this (.startFieldAnnotation field-name annotation-name))))

(defn end-sub-annotation
  ""
  ([^ASMModParser this]
    (-> this (.endSubAnnotation))))

