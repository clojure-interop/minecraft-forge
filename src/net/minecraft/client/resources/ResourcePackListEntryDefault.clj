(ns net.minecraft.client.resources.ResourcePackListEntryDefault
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourcePackListEntryDefault]))

(defn ->resource-pack-list-entry-default
  "Constructor.

  resource-packs-gui-in - `net.minecraft.client.gui.GuiScreenResourcePacks`"
  (^ResourcePackListEntryDefault [^net.minecraft.client.gui.GuiScreenResourcePacks resource-packs-gui-in]
    (new ResourcePackListEntryDefault resource-packs-gui-in)))

(defn server-pack?
  "returns: `boolean`"
  (^Boolean [^ResourcePackListEntryDefault this]
    (-> this (.isServerPack))))

