(ns net.minecraftforge.client.model.obj.OBJModel$Parser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$Parser]))

(defn ->parser
  "Constructor.

  from - `net.minecraft.client.resources.IResource`
  manager - `net.minecraft.client.resources.IResourceManager`

  throws: java.io.IOException"
  (^OBJModel$Parser [^net.minecraft.client.resources.IResource from ^net.minecraft.client.resources.IResourceManager manager]
    (new OBJModel$Parser from manager)))

(defn material-library
  "Instance Field.

  type: net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary"
  (^net.minecraftforge.client.model.obj.OBJModel$MaterialLibrary [^OBJModel$Parser this]
    (-> this .-materialLibrary)))

(defn get-elements
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^OBJModel$Parser this]
    (-> this (.getElements))))

(defn parse
  "returns: `net.minecraftforge.client.model.obj.OBJModel`

  throws: java.io.IOException"
  (^net.minecraftforge.client.model.obj.OBJModel [^OBJModel$Parser this]
    (-> this (.parse))))

