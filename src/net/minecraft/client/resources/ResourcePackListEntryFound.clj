(ns net.minecraft.client.resources.ResourcePackListEntryFound
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.resources ResourcePackListEntryFound]))

(defn ->resource-pack-list-entry-found
  "Constructor.

  resource-packs-gui-in - `net.minecraft.client.gui.GuiScreenResourcePacks`
  entry - `net.minecraft.client.resources.ResourcePackRepository$Entry`"
  (^ResourcePackListEntryFound [^net.minecraft.client.gui.GuiScreenResourcePacks resource-packs-gui-in ^net.minecraft.client.resources.ResourcePackRepository$Entry entry]
    (new ResourcePackListEntryFound resource-packs-gui-in entry)))

(defn get-resource-pack-entry
  "returns: `net.minecraft.client.resources.ResourcePackRepository$Entry`"
  (^net.minecraft.client.resources.ResourcePackRepository$Entry [^ResourcePackListEntryFound this]
    (-> this (.getResourcePackEntry))))

