(ns net.minecraft.client.renderer.GLAllocation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GLAllocation]))

(defn ->gl-allocation
  "Constructor."
  (^GLAllocation []
    (new GLAllocation )))

(defn *generate-display-lists
  "range - `int`

  returns: `int`"
  (^Integer [^Integer range]
    (GLAllocation/generateDisplayLists range)))

(defn *delete-display-lists
  "list - `int`
  range - `int`"
  ([^Integer list ^Integer range]
    (GLAllocation/deleteDisplayLists list range))
  ([^Integer list]
    (GLAllocation/deleteDisplayLists list)))

(defn *create-direct-byte-buffer
  "capacity - `int`

  returns: `java.nio.ByteBuffer`"
  (^java.nio.ByteBuffer [^Integer capacity]
    (GLAllocation/createDirectByteBuffer capacity)))

(defn *create-direct-int-buffer
  "capacity - `int`

  returns: `java.nio.IntBuffer`"
  (^java.nio.IntBuffer [^Integer capacity]
    (GLAllocation/createDirectIntBuffer capacity)))

(defn *create-direct-float-buffer
  "capacity - `int`

  returns: `java.nio.FloatBuffer`"
  (^java.nio.FloatBuffer [^Integer capacity]
    (GLAllocation/createDirectFloatBuffer capacity)))

