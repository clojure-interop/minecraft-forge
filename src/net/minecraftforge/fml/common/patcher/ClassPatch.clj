(ns net.minecraftforge.fml.common.patcher.ClassPatch
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.patcher ClassPatch]))

(defn ->class-patch
  "Constructor.

  name - `java.lang.String`
  source-class-name - `java.lang.String`
  target-class-name - `java.lang.String`
  exists-at-target - `boolean`
  input-checksum - `int`
  patch - `byte[]`"
  (^ClassPatch [^java.lang.String name ^java.lang.String source-class-name ^java.lang.String target-class-name ^Boolean exists-at-target ^Integer input-checksum patch]
    (new ClassPatch name source-class-name target-class-name exists-at-target input-checksum patch)))

(defn name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ClassPatch this]
    (-> this .-name)))

(defn source-class-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ClassPatch this]
    (-> this .-sourceClassName)))

(defn target-class-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ClassPatch this]
    (-> this .-targetClassName)))

(defn exists-at-target
  "Instance Constant.

  type: boolean"
  (^Boolean [^ClassPatch this]
    (-> this .-existsAtTarget)))

(defn patch
  "Instance Constant.

  type: byte[]"
  ([^ClassPatch this]
    (-> this .-patch)))

(defn input-checksum
  "Instance Constant.

  type: int"
  (^Integer [^ClassPatch this]
    (-> this .-inputChecksum)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ClassPatch this]
    (-> this (.toString))))

