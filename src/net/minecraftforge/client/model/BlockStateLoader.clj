(ns net.minecraftforge.client.model.BlockStateLoader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model BlockStateLoader]))

(defn ->block-state-loader
  "Constructor."
  (^BlockStateLoader []
    (new BlockStateLoader )))

(defn *load
  "Loads a BlockStates json file.
   Will attempt to parse it as a Forge Enhanced version if possible.
   Will fall back to standard loading if marker is not present.

   Note: This method is NOT thread safe

  reader - json read - `java.io.Reader`
  vanilla-gson - ModelBlockDefinition's GSON reader. - `com.google.gson.Gson`

  returns: Model definition including variants for all known combinations. - `net.minecraft.client.renderer.block.model.ModelBlockDefinition`"
  (^net.minecraft.client.renderer.block.model.ModelBlockDefinition [^java.io.Reader reader ^com.google.gson.Gson vanilla-gson]
    (BlockStateLoader/load reader vanilla-gson)))

