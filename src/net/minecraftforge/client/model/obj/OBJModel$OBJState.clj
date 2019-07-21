(ns net.minecraftforge.client.model.obj.OBJModel$OBJState
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$OBJState]))

(defn ->obj-state
  "Constructor.

  Deprecated.

  visible-groups - `java.util.List`
  visibility - `boolean`
  parent - `net.minecraftforge.common.model.IModelState`"
  (^OBJModel$OBJState [^java.util.List visible-groups ^Boolean visibility ^net.minecraftforge.common.model.IModelState parent]
    (new OBJModel$OBJState visible-groups visibility parent))
  (^OBJModel$OBJState [^java.util.List visible-groups ^Boolean visibility]
    (new OBJModel$OBJState visible-groups visibility)))

(defn parent
  "Instance Field.

  Deprecated.

  type: net.minecraftforge.common.model.IModelState"
  (^net.minecraftforge.common.model.IModelState [^OBJModel$OBJState this]
    (-> this .-parent)))

(defn get-groups-with-visibility
  "Deprecated.

  visibility - `boolean`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OBJModel$OBJState this ^Boolean visibility]
    (-> this (.getGroupsWithVisibility visibility))))

(defn get-group-names-from-map
  "Deprecated.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OBJModel$OBJState this]
    (-> this (.getGroupNamesFromMap))))

(defn to-string
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^OBJModel$OBJState this]
    (-> this (.toString))))

(defn get-visibility-map
  "Deprecated.

  returns: `java.util.Map<java.lang.String,java.lang.Boolean>`"
  (^java.util.Map [^OBJModel$OBJState this]
    (-> this (.getVisibilityMap))))

(defn apply
  "Deprecated.

  part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^OBJModel$OBJState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn change-group-visibilities
  "Deprecated.

  names - `java.util.List`
  operation - `net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation`"
  ([^OBJModel$OBJState this ^java.util.List names ^net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation operation]
    (-> this (.changeGroupVisibilities names operation))))

(defn get-parent
  "Deprecated.

  parent - `net.minecraftforge.common.model.IModelState`

  returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^OBJModel$OBJState this ^net.minecraftforge.common.model.IModelState parent]
    (-> this (.getParent parent))))

(defn hash-code
  "Deprecated.

  returns: `int`"
  (^Integer [^OBJModel$OBJState this]
    (-> this (.hashCode))))

(defn equals
  "Deprecated.

  obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OBJModel$OBJState this ^java.lang.Object obj]
    (-> this (.equals obj))))

