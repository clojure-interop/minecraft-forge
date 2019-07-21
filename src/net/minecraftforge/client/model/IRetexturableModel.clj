(ns net.minecraftforge.client.model.IRetexturableModel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IRetexturableModel]))

(defn retexture
  "Applies new textures to the model.
   The returned model should be independent of the accessed one,
   as a model should be able to be retextured multiple times producing
   a separate model each time.

   The input map MAY map to an empty string \"\" which should be used
   to indicate the texture was removed. Handling of that is up to
   the model itself. Such as using default, missing texture, or
   removing vertices.

   The input should be considered a DIFF of the old textures, not a
   replacement as it may not contain everything.

  textures - New - `com.google.common.collect.ImmutableMap`

  returns: Model with textures applied. - `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^IRetexturableModel this ^com.google.common.collect.ImmutableMap textures]
    (-> this (.retexture textures))))

