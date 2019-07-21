(ns net.minecraftforge.client.ItemModelMesherForge
  "Wrapper around ItemModeMesher that cleans up the internal maps to respect ID remapping."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client ItemModelMesherForge]))

(defn ->item-model-mesher-forge
  "Constructor.

  manager - `net.minecraft.client.renderer.block.model.ModelManager`"
  (^ItemModelMesherForge [^net.minecraft.client.renderer.block.model.ModelManager manager]
    (new ItemModelMesherForge manager)))

(defn register
  "item - `net.minecraft.item.Item`
  meta - `int`
  location - `net.minecraft.client.renderer.block.model.ModelResourceLocation`"
  ([^ItemModelMesherForge this ^net.minecraft.item.Item item ^Integer meta ^net.minecraft.client.renderer.block.model.ModelResourceLocation location]
    (-> this (.register item meta location))))

(defn rebuild-cache
  ""
  ([^ItemModelMesherForge this]
    (-> this (.rebuildCache))))

