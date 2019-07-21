(ns net.minecraftforge.client.model.ModelProcessingHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelProcessingHelper]))

(defn ->model-processing-helper
  "Constructor."
  (^ModelProcessingHelper []
    (new ModelProcessingHelper )))

(defn *retexture
  "model - `net.minecraftforge.client.model.IModel`
  textures - `com.google.common.collect.ImmutableMap`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraftforge.client.model.IModel model ^com.google.common.collect.ImmutableMap textures]
    (ModelProcessingHelper/retexture model textures)))

(defn *custom-data
  "model - `net.minecraftforge.client.model.IModel`
  custom-data - `com.google.common.collect.ImmutableMap`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraftforge.client.model.IModel model ^com.google.common.collect.ImmutableMap custom-data]
    (ModelProcessingHelper/customData model custom-data)))

(defn *smooth-lighting
  "model - `net.minecraftforge.client.model.IModel`
  smooth - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraftforge.client.model.IModel model ^Boolean smooth]
    (ModelProcessingHelper/smoothLighting model smooth)))

(defn *gui-3d
  "model - `net.minecraftforge.client.model.IModel`
  gui-3d - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraftforge.client.model.IModel model ^Boolean gui-3d]
    (ModelProcessingHelper/gui3d model gui-3d)))

(defn *uvlock
  "model - `net.minecraftforge.client.model.IModel`
  uvlock - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraftforge.client.model.IModel model ^Boolean uvlock]
    (ModelProcessingHelper/uvlock model uvlock)))

