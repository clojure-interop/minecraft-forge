(ns net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$MaterialLibrary]))

(defn ->material-library
  "Constructor."
  (^OBJModel$MaterialLibrary []
    (new OBJModel$MaterialLibrary )))

(defn make-lib-with-replacements
  "replacements - `com.google.common.collect.ImmutableMap`

  returns: `net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary`"
  (^net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary [^OBJModel$MaterialLibrary this ^com.google.common.collect.ImmutableMap replacements]
    (-> this (.makeLibWithReplacements replacements))))

(defn get-groups
  "returns: `java.util.Map<java.lang.String,net.minecraftforge.client.model.obj.OBJModel$Group>`"
  (^java.util.Map [^OBJModel$MaterialLibrary this]
    (-> this (.getGroups))))

(defn get-groups-containing-face
  "f - `net.minecraftforge.client.model.obj.OBJModel$Face`

  returns: `java.util.List<net.minecraftforge.client.model.obj.OBJModel$Group>`"
  (^java.util.List [^OBJModel$MaterialLibrary this ^net.minecraftforge.client.model.obj.OBJModel$Face f]
    (-> this (.getGroupsContainingFace f))))

(defn change-material-color
  "name - `java.lang.String`
  color - `int`"
  ([^OBJModel$MaterialLibrary this ^java.lang.String name ^Integer color]
    (-> this (.changeMaterialColor name color))))

(defn get-material
  "name - `java.lang.String`

  returns: `net.minecraftforge.client.model.obj.OBJModel$Material`"
  (^net.minecraftforge.client.model.obj.OBJModel$Material [^OBJModel$MaterialLibrary this ^java.lang.String name]
    (-> this (.getMaterial name))))

(defn get-material-names
  "returns: `com.google.common.collect.ImmutableList<java.lang.String>`"
  (^com.google.common.collect.ImmutableList [^OBJModel$MaterialLibrary this]
    (-> this (.getMaterialNames))))

(defn parse-materials
  "manager - `net.minecraft.client.resources.IResourceManager`
  path - `java.lang.String`
  from - `net.minecraft.util.ResourceLocation`

  throws: java.io.IOException"
  ([^OBJModel$MaterialLibrary this ^net.minecraft.client.resources.IResourceManager manager ^java.lang.String path ^net.minecraft.util.ResourceLocation from]
    (-> this (.parseMaterials manager path from))))

