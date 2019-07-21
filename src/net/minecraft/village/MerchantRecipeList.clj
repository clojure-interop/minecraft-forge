(ns net.minecraft.village.MerchantRecipeList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village MerchantRecipeList]))

(defn ->merchant-recipe-list
  "Constructor.

  compound - `net.minecraft.nbt.NBTTagCompound`"
  (^MerchantRecipeList [^net.minecraft.nbt.NBTTagCompound compound]
    (new MerchantRecipeList compound))
  (^MerchantRecipeList []
    (new MerchantRecipeList )))

(defn *read-from-buf
  "buffer - `net.minecraft.network.PacketBuffer`

  returns: `net.minecraft.village.MerchantRecipeList`

  throws: java.io.IOException"
  (^net.minecraft.village.MerchantRecipeList [^net.minecraft.network.PacketBuffer buffer]
    (MerchantRecipeList/readFromBuf buffer)))

(defn can-recipe-be-used
  "stack-0 - `net.minecraft.item.ItemStack`
  stack-1 - `net.minecraft.item.ItemStack`
  index - `int`

  returns: `net.minecraft.village.MerchantRecipe`"
  (^net.minecraft.village.MerchantRecipe [^MerchantRecipeList this ^net.minecraft.item.ItemStack stack-0 ^net.minecraft.item.ItemStack stack-1 ^Integer index]
    (-> this (.canRecipeBeUsed stack-0 stack-1 index))))

(defn write-to-buf
  "buffer - `net.minecraft.network.PacketBuffer`"
  ([^MerchantRecipeList this ^net.minecraft.network.PacketBuffer buffer]
    (-> this (.writeToBuf buffer))))

(defn read-recipies-from-tags
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^MerchantRecipeList this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readRecipiesFromTags compound))))

(defn get-recipies-as-tags
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^MerchantRecipeList this]
    (-> this (.getRecipiesAsTags))))

