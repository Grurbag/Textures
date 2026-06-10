// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGoblin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodelgoblin"), "main");
	private final ModelPart hand_right;
	private final ModelPart leg_left;
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart hand_left;
	private final ModelPart leg_right;

	public WFMModelGoblin(ModelPart root) {
		this.hand_right = root.getChild("hand_right");
		this.leg_left = root.getChild("leg_left");
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.hand_left = root.getChild("hand_left");
		this.leg_right = root.getChild("leg_right");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hand_right = partdefinition.addOrReplaceChild("hand_right", CubeListBuilder.create().texOffs(40, 16).addBox(-2.5F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offset(-5.0F, 6.7F, 0.0F));

		PartDefinition leg_left = partdefinition.addOrReplaceChild("leg_left", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.1F, -1.3F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(1.9F, 13.2F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, -2.0F));

		PartDefinition ear_right = head.addOrReplaceChild("ear_right", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.8771F, 0.4802F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.2F, -4.0F, -3.0F, 0.5236F, -0.7854F, 0.0F));

		PartDefinition ear_left = head.addOrReplaceChild("ear_left", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.8771F, 0.4802F, 0.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -4.0F, -3.0F, 0.5236F, 0.7854F, 0.0F));

		PartDefinition nose = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -0.8036F, 0.5951F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -0.5F, -8.5F, 0.6374F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.6F, 0.0F));

		PartDefinition hand_left = partdefinition.addOrReplaceChild("hand_left", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.5F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(5.0F, 6.7F, 0.0F));

		PartDefinition leg_right = partdefinition.addOrReplaceChild("leg_right", CubeListBuilder.create().texOffs(0, 16).addBox(-1.9F, -1.3F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offset(-1.9F, 13.2F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		hand_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hand_left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg_right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}