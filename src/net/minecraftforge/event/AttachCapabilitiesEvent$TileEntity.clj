(ns net.minecraftforge.event.AttachCapabilitiesEvent$TileEntity
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AttachCapabilitiesEvent$TileEntity]))

(defn ->tile-entity
  "Constructor.

  Deprecated.

  te - `net.minecraft.tileentity.TileEntity`"
  (^AttachCapabilitiesEvent$TileEntity [^net.minecraft.tileentity.TileEntity te]
    (new AttachCapabilitiesEvent$TileEntity te)))

(defn get-tile-entity
  "Deprecated.

  returns: `net.minecraft.tileentity.TileEntity`"
  (^net.minecraft.tileentity.TileEntity [^AttachCapabilitiesEvent$TileEntity this]
    (-> this (.getTileEntity))))

