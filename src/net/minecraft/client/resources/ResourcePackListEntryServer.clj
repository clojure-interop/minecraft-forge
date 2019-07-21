(ns net.minecraft.client.resources.ResourcePackListEntryServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourcePackListEntryServer]))

(defn ->resource-pack-list-entry-server
  "Constructor.

  resource-packs-gui-in - `net.minecraft.client.gui.GuiScreenResourcePacks`
  resource-pack-in - `net.minecraft.client.resources.IResourcePack`"
  (^ResourcePackListEntryServer [^net.minecraft.client.gui.GuiScreenResourcePacks resource-packs-gui-in ^net.minecraft.client.resources.IResourcePack resource-pack-in]
    (new ResourcePackListEntryServer resource-packs-gui-in resource-pack-in)))

(defn server-pack?
  "returns: `boolean`"
  (^Boolean [^ResourcePackListEntryServer this]
    (-> this (.isServerPack))))

