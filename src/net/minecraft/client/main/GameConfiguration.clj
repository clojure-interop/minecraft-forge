(ns net.minecraft.client.main.GameConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.main GameConfiguration]))

(defn ->game-configuration
  "Constructor.

  user-info-in - `net.minecraft.client.main.GameConfiguration$UserInformation`
  display-info-in - `net.minecraft.client.main.GameConfiguration$DisplayInformation`
  folder-info-in - `net.minecraft.client.main.GameConfiguration$FolderInformation`
  game-info-in - `net.minecraft.client.main.GameConfiguration$GameInformation`
  server-info-in - `net.minecraft.client.main.GameConfiguration$ServerInformation`"
  (^GameConfiguration [^net.minecraft.client.main.GameConfiguration$UserInformation user-info-in ^net.minecraft.client.main.GameConfiguration$DisplayInformation display-info-in ^net.minecraft.client.main.GameConfiguration$FolderInformation folder-info-in ^net.minecraft.client.main.GameConfiguration$GameInformation game-info-in ^net.minecraft.client.main.GameConfiguration$ServerInformation server-info-in]
    (new GameConfiguration user-info-in display-info-in folder-info-in game-info-in server-info-in)))

(defn user-info
  "Instance Constant.

  type: net.minecraft.client.main.GameConfiguration$UserInformation"
  (^net.minecraft.client.main.GameConfiguration$UserInformation [^GameConfiguration this]
    (-> this .-userInfo)))

(defn display-info
  "Instance Constant.

  type: net.minecraft.client.main.GameConfiguration$DisplayInformation"
  (^net.minecraft.client.main.GameConfiguration$DisplayInformation [^GameConfiguration this]
    (-> this .-displayInfo)))

(defn folder-info
  "Instance Constant.

  type: net.minecraft.client.main.GameConfiguration$FolderInformation"
  (^net.minecraft.client.main.GameConfiguration$FolderInformation [^GameConfiguration this]
    (-> this .-folderInfo)))

(defn game-info
  "Instance Constant.

  type: net.minecraft.client.main.GameConfiguration$GameInformation"
  (^net.minecraft.client.main.GameConfiguration$GameInformation [^GameConfiguration this]
    (-> this .-gameInfo)))

(defn server-info
  "Instance Constant.

  type: net.minecraft.client.main.GameConfiguration$ServerInformation"
  (^net.minecraft.client.main.GameConfiguration$ServerInformation [^GameConfiguration this]
    (-> this .-serverInfo)))

