(ns net.minecraftforge.oredict.OreDictionary
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.oredict OreDictionary]))

(defn ->ore-dictionary
  "Constructor."
  (^OreDictionary []
    (new OreDictionary )))

(def *-empty-list
  "Static Constant.

  type: net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>"
  OreDictionary/EMPTY_LIST)

(def *-wildcard-value
  "Static Constant.

  Minecraft changed from -1 to Short.MAX_VALUE in 1.5 release for the \"block wildcard\". Use this in case it
   changes again.

  type: int"
  OreDictionary/WILDCARD_VALUE)

(defn *get-ore-names
  "Retrieves a list of all unique ore names that are already registered.

  returns: All unique ore names that are currently registered. - `java.lang.String[]`"
  ([]
    (OreDictionary/getOreNames )))

(defn *get-ores
  "Retrieves the List of items that are registered to this ore type at this instant.
   If the flag is TRUE, then it will create the list as empty if it did not exist.

   This option should be used by modders who are doing blanket scans in postInit.
   It greatly reduces clutter in the OreDictionary is the responsible and proper
   way to use the dictionary in a large number of cases.

   The other function above is utilized in OreRecipe and is required for the
   operation of that code.

  name - The ore name, directly calls getOreID if the flag is TRUE - `java.lang.String`
  always-create-entry - Flag - should a new entry be created if empty - `boolean`

  returns: An arraylist containing ItemStacks registered for this ore - `net.minecraft.util.NonNullList<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.NonNullList [^java.lang.String name ^Boolean always-create-entry]
    (OreDictionary/getOres name always-create-entry))
  (^net.minecraft.util.NonNullList [^java.lang.String name]
    (OreDictionary/getOres name)))

(defn *contains-match
  "strict - `boolean`
  inputs - `net.minecraft.util.NonNullList`
  targets - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^Boolean strict ^net.minecraft.util.NonNullList inputs ^net.minecraft.item.ItemStack targets]
    (OreDictionary/containsMatch strict inputs targets)))

(defn *rebake-map
  ""
  ([]
    (OreDictionary/rebakeMap )))

(defn *get-ore-i-ds
  "Gets all the integer ID for the ores that the specified item stack is registered to.
   If the item stack is not linked to any ore, this will return an empty array and no new entry will be created.

  stack - The item stack of the ore. - `net.minecraft.item.ItemStack`

  returns: An array of ids that this ore is registered as. - `int[]`"
  ([^net.minecraft.item.ItemStack stack]
    (OreDictionary/getOreIDs stack)))

(defn *get-ore-id
  "Gets the integer ID for the specified ore name.
   If the name does not have a ID it assigns it a new one.

  name - The unique name for this ore 'oreIron', 'ingotIron', etc.. - `java.lang.String`

  returns: A number representing the ID for this ore type - `int`"
  (^Integer [^java.lang.String name]
    (OreDictionary/getOreID name)))

(defn *register-ore
  "name - `java.lang.String`
  ore - `net.minecraft.item.Item`"
  ([^java.lang.String name ^net.minecraft.item.Item ore]
    (OreDictionary/registerOre name ore)))

(defn *does-ore-name-exist
  "Returns whether or not an oreName exists in the dictionary.
   This function can be used to safely query the Ore Dictionary without
   adding needless clutter to the underlying map structure.

   Please use this when possible and appropriate.

  name - The ore name - `java.lang.String`

  returns: Whether or not that name is in the Ore Dictionary. - `boolean`"
  (^Boolean [^java.lang.String name]
    (OreDictionary/doesOreNameExist name)))

(defn *item-matches
  "target - `net.minecraft.item.ItemStack`
  input - `net.minecraft.item.ItemStack`
  strict - `boolean`

  returns: `boolean`"
  (^Boolean [^net.minecraft.item.ItemStack target ^net.minecraft.item.ItemStack input ^Boolean strict]
    (OreDictionary/itemMatches target input strict)))

(defn *get-ore-name
  "Reverse of getOreID, will not create new entries.

  id - The ID to translate to a string - `int`

  returns: The String name, or \"Unknown\" if not found. - `java.lang.String`"
  (^java.lang.String [^Integer id]
    (OreDictionary/getOreName id)))

