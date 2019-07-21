(ns net.minecraftforge.client.model.obj.OBJModel$Group
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Group]))

(defn ->group
  "Constructor.

  Deprecated.

  name - `java.lang.String`
  faces - `java.util.LinkedHashSet`"
  (^OBJModel$Group [^java.lang.String name ^java.util.LinkedHashSet faces]
    (new OBJModel$Group name faces)))

(def *-default-name
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  OBJModel$Group/DEFAULT_NAME)

(def *-all
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  OBJModel$Group/ALL)

(def *-all-except
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  OBJModel$Group/ALL_EXCEPT)

(defn min-uv-bounds
  "Instance Field.

  Deprecated.

  type: float[]"
  ([^OBJModel$Group this]
    (-> this .-minUVBounds)))

(defn max-uv-bounds
  "Instance Field.

  Deprecated.

  type: float[]"
  ([^OBJModel$Group this]
    (-> this .-maxUVBounds)))

(defn apply-transform
  "Deprecated.

  transform - `com.google.common.base.Optional`

  returns: `java.util.LinkedHashSet<net.minecraftforge.client.model.obj.OBJModel$Face>`"
  (^java.util.LinkedHashSet [^OBJModel$Group this ^com.google.common.base.Optional transform]
    (-> this (.applyTransform transform))))

(defn get-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$Group this]
    (-> this (.getName))))

(defn get-faces
  "Deprecated.

  returns: `java.util.LinkedHashSet<net.minecraftforge.client.model.obj.OBJModel$Face>`"
  (^java.util.LinkedHashSet [^OBJModel$Group this]
    (-> this (.getFaces))))

(defn set-faces
  "Deprecated.

  faces - `java.util.LinkedHashSet`"
  ([^OBJModel$Group this ^java.util.LinkedHashSet faces]
    (-> this (.setFaces faces))))

(defn add-face
  "Deprecated.

  face - `net.minecraftforge.client.model.obj.OBJModel$Face`"
  ([^OBJModel$Group this ^net.minecraftforge.client.model.obj.OBJModel$Face face]
    (-> this (.addFace face))))

(defn add-faces
  "Deprecated.

  faces - `java.util.List`"
  ([^OBJModel$Group this ^java.util.List faces]
    (-> this (.addFaces faces))))

