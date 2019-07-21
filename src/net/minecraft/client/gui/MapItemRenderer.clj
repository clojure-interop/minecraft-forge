(ns net.minecraft.client.gui.MapItemRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui MapItemRenderer]))

(defn ->map-item-renderer
  "Constructor.

  texture-manager-in - `net.minecraft.client.renderer.texture.TextureManager`"
  (^MapItemRenderer [^net.minecraft.client.renderer.texture.TextureManager texture-manager-in]
    (new MapItemRenderer texture-manager-in)))

(defn update-map-texture
  "mapdata-in - `net.minecraft.world.storage.MapData`"
  ([^MapItemRenderer this ^net.minecraft.world.storage.MapData mapdata-in]
    (-> this (.updateMapTexture mapdata-in))))

(defn render-map
  "mapdata-in - `net.minecraft.world.storage.MapData`
  p-148250-2 - `boolean`"
  ([^MapItemRenderer this ^net.minecraft.world.storage.MapData mapdata-in ^Boolean p-148250-2]
    (-> this (.renderMap mapdata-in p-148250-2))))

(defn get-map-instance-if-exists
  "p-191205-1 - `java.lang.String`

  returns: `net.minecraft.client.gui.MapItemRenderer.Instance`"
  (^net.minecraft.client.gui.MapItemRenderer.Instance [^MapItemRenderer this ^java.lang.String p-191205-1]
    (-> this (.getMapInstanceIfExists p-191205-1))))

(defn clear-loaded-maps
  ""
  ([^MapItemRenderer this]
    (-> this (.clearLoadedMaps))))

(defn get-data
  "p-191207-1 - `net.minecraft.client.gui.MapItemRenderer.Instance`

  returns: `net.minecraft.world.storage.MapData`"
  (^net.minecraft.world.storage.MapData [^MapItemRenderer this ^net.minecraft.client.gui.MapItemRenderer.Instance p-191207-1]
    (-> this (.getData p-191207-1))))

