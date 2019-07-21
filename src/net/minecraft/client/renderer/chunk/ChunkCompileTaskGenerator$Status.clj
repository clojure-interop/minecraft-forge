(ns net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk ChunkCompileTaskGenerator$Status]))

(def PENDING
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status"
  ChunkCompileTaskGenerator$Status/PENDING)

(def COMPILING
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status"
  ChunkCompileTaskGenerator$Status/COMPILING)

(def UPLOADING
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status"
  ChunkCompileTaskGenerator$Status/UPLOADING)

(def DONE
  "Enum Constant.

  type: net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status"
  ChunkCompileTaskGenerator$Status/DONE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ChunkCompileTaskGenerator.Status c : ChunkCompileTaskGenerator.Status.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status[]`"
  ([]
    (ChunkCompileTaskGenerator$Status/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status [^java.lang.String name]
    (ChunkCompileTaskGenerator$Status/valueOf name)))

