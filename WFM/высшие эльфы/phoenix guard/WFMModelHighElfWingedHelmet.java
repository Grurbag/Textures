// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelHighElfWingedHelmet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodelhighelfwingedhelmet"), "main");
	private final ModelPart helmet;

	public WFMModelHighElfWingedHelmet(ModelPart root) {
		this.helmet = root.getChild("helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition helmet = partdefinition.addOrReplaceChild("helmet", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition dragon = helmet.addOrReplaceChild("dragon", CubeListBuilder.create().texOffs(42, 12).addBox(2.5F, -7.0F, -4.0F, 0.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -12.0F, -2.5F));

		PartDefinition nose_1 = helmet.addOrReplaceChild("nose_1", CubeListBuilder.create().texOffs(32, 21).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -7.2F, -4.5F));

		PartDefinition nose_2 = helmet.addOrReplaceChild("nose_2", CubeListBuilder.create().texOffs(32, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -6.2F, -4.6F));

		PartDefinition helmet_1 = helmet.addOrReplaceChild("helmet_1", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, 0.0F, 0.0F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, -10.0F, -3.5F));

		PartDefinition wing_left = helmet.addOrReplaceChild("wing_left", CubeListBuilder.create().texOffs(40, -12).mirror().addBox(1.0F, -4.0F, 0.0F, 0.0F, 20.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.0F, -16.0F, -3.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition helmet_2 = helmet.addOrReplaceChild("helmet_2", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -11.0F, -3.0F));

		PartDefinition wing_right = helmet.addOrReplaceChild("wing_right", CubeListBuilder.create().texOffs(40, -12).addBox(0.0F, -4.0F, 0.0F, 0.0F, 20.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -16.0F, -3.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition nose_3 = helmet.addOrReplaceChild("nose_3", CubeListBuilder.create().texOffs(32, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -12.8F, -3.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition helmet_3 = helmet.addOrReplaceChild("helmet_3", CubeListBuilder.create().texOffs(24, 26).addBox(0.0F, 0.0F, 0.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -12.0F, -2.5F));

		PartDefinition nose_4 = helmet.addOrReplaceChild("nose_4", CubeListBuilder.create().texOffs(32, 14).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -11.9F, -3.3F, -0.2094F, 0.0F, 0.0F));

		PartDefinition nose_5 = helmet.addOrReplaceChild("nose_5", CubeListBuilder.create().texOffs(32, 16).addBox(0.0F, 0.0F, 0.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -11.0F, -3.7F, -0.2094F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}