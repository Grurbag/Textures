// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelTroll<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodeltroll"), "main");
	private final ModelPart body;
	private final ModelPart leg_right;
	private final ModelPart hand_right;
	private final ModelPart leg_left;
	private final ModelPart hand_left;
	private final ModelPart head;

	public WFMModelTroll(ModelPart root) {
		this.body = root.getChild("body");
		this.leg_right = root.getChild("leg_right");
		this.hand_right = root.getChild("hand_right");
		this.leg_left = root.getChild("leg_left");
		this.hand_left = root.getChild("hand_left");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(18, 16).addBox(-4.0F, 0.0F, -2.0F, 10.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -2.0F, -1.0F));

		PartDefinition cape = body.addOrReplaceChild("cape", CubeListBuilder.create().texOffs(22, 38).addBox(-9.0F, -19.0F, 0.4F, 10.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 19.0F, 7.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition portki = body.addOrReplaceChild("portki", CubeListBuilder.create().texOffs(22, 58).addBox(-9.0F, -6.0F, 1.0F, 10.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, -3.0F));

		PartDefinition leg_right = partdefinition.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.8F, -2.3F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 13.5F, 0.1F));

		PartDefinition leg_right_1 = leg_right.addOrReplaceChild("leg_right_1", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -0.8F, -2.3F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.8F, 1.0F));

		PartDefinition leg_right_2 = leg_right_1.addOrReplaceChild("leg_right_2", CubeListBuilder.create().texOffs(0, 39).addBox(0.0F, 0.0F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.1F, 3.7F, -5.0F));

		PartDefinition hand_right = partdefinition.addOrReplaceChild("hand_right", CubeListBuilder.create().texOffs(50, 17).addBox(-4.2615F, -2.9886F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, 1.0F, -0.1F, 0.0F, 0.0F, 0.0873F));

		PartDefinition hand_right_1 = hand_right.addOrReplaceChild("hand_right_1", CubeListBuilder.create().texOffs(50, 29).addBox(0.0F, 0.0F, -0.1F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.7615F, 0.5114F, -2.0F));

		PartDefinition hand_right_1_1 = hand_right_1.addOrReplaceChild("hand_right_1_1", CubeListBuilder.create().texOffs(50, 42).addBox(0.0F, 0.0F, 0.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hand_right_1_4 = hand_right_1_1.addOrReplaceChild("hand_right_1_4", CubeListBuilder.create().texOffs(50, 54).addBox(-0.7385F, 4.0F, 7.6F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -8.0F));

		PartDefinition leg_left = partdefinition.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -0.8F, -2.3F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 13.5F, 0.1F));

		PartDefinition leg_right_1_1 = leg_left.addOrReplaceChild("leg_right_1_1", CubeListBuilder.create().texOffs(0, 27).addBox(-2.0F, -0.8F, -2.3F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.8F, 1.0F));

		PartDefinition leg_right_2_1 = leg_right_1_1.addOrReplaceChild("leg_right_2_1", CubeListBuilder.create().texOffs(0, 39).addBox(-0.6F, -0.5F, 0.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.4F, 4.2F, -5.1F));

		PartDefinition hand_left = partdefinition.addOrReplaceChild("hand_left", CubeListBuilder.create().texOffs(50, 17).addBox(0.2615F, -2.9886F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.0F, -0.1F, 0.0F, 0.0F, -0.0873F));

		PartDefinition hand_right_1_2 = hand_left.addOrReplaceChild("hand_right_1_2", CubeListBuilder.create().texOffs(50, 29).addBox(0.0F, 0.0F, -0.1F, 4.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.7615F, 0.5114F, -2.0F));

		PartDefinition hand_right_1_3 = hand_right_1_2.addOrReplaceChild("hand_right_1_3", CubeListBuilder.create().texOffs(50, 42).addBox(0.0F, 0.0F, 0.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition hand_left_1_4 = hand_right_1_3.addOrReplaceChild("hand_left_1_4", CubeListBuilder.create().texOffs(50, 54).addBox(-0.7385F, 4.0F, 7.6F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4771F, 1.0F, -8.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(71, 0).addBox(-5.0F, -4.0F, -8.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.5F, -2.5F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 1.0F, 0.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -3.0F, -9.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(28, 0).addBox(0.0F, 0.0F, 0.0F, 9.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 4.6F, -11.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition fang_left = jaw.addOrReplaceChild("fang_left", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -1.5F, 0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -1.5F, -0.5F));

		PartDefinition fang_right = jaw.addOrReplaceChild("fang_right", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition ear_right = head.addOrReplaceChild("ear_right", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -3.5F, -3.0F, 0.0873F, 0.2618F, 0.2618F));

		PartDefinition ear_left = head.addOrReplaceChild("ear_left", CubeListBuilder.create().texOffs(22, 0).addBox(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -2.5F, -4.0F, 0.0873F, -0.2618F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hand_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hand_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}