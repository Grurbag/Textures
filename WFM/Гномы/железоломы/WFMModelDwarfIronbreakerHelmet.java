// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfIronbreakerHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mustache_left;
	private final ModelRenderer mustache_left_r1_r1;
	private final ModelRenderer mustache_left_r1_r2;
	private final ModelRenderer ear2_r1;
	private final ModelRenderer ear_r1;
	private final ModelRenderer mustache_right;
	private final ModelRenderer mustache_right_r1_r1;
	private final ModelRenderer mustache_right_r1_r2;

	public WFMModelDwarfIronbreakerHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 24.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(36, 44).addBox(-1.0F, -10.0F, -6.0F, 2.0F, 8.0F, 12.0F, 0.0F, false);
		head.texOffs(38, 26).addBox(-3.0F, -10.0F, -6.0F, 1.0F, 5.0F, 12.0F, 0.0F, false);
		head.texOffs(38, 26).addBox(2.0F, -10.0F, -6.0F, 1.0F, 5.0F, 12.0F, 0.0F, false);

		mustache_left = new ModelRenderer(this);
		mustache_left.setPos(-4.0F, 0.5F, -5.1F);
		head.addChild(mustache_left);
		setRotationAngle(mustache_left, 0.0F, 0.0F, 0.3054F);
		mustache_left.texOffs(0, 55).addBox(-3.0F, -4.5F, -0.4F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		mustache_left_r1_r1 = new ModelRenderer(this);
		mustache_left_r1_r1.setPos(-2.75F, -3.5F, -0.05F);
		mustache_left.addChild(mustache_left_r1_r1);
		setRotationAngle(mustache_left_r1_r1, 0.0F, 0.0F, 0.3491F);
		mustache_left_r1_r1.texOffs(12, 55).addBox(-3.0F, -4.5F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, true);

		mustache_left_r1_r2 = new ModelRenderer(this);
		mustache_left_r1_r2.setPos(-1.25F, -2.5F, -0.15F);
		mustache_left.addChild(mustache_left_r1_r2);
		setRotationAngle(mustache_left_r1_r2, 0.0F, 0.0F, 0.2182F);
		mustache_left_r1_r2.texOffs(12, 55).addBox(-3.0F, -4.5F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, true);

		ear2_r1 = new ModelRenderer(this);
		ear2_r1.setPos(5.0F, -4.7071F, 0.0F);
		head.addChild(ear2_r1);
		setRotationAngle(ear2_r1, 0.7854F, 0.0F, 3.1416F);
		ear2_r1.texOffs(0, 31).addBox(-1.0F, -2.5F, -2.5F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		ear_r1 = new ModelRenderer(this);
		ear_r1.setPos(-5.0F, -4.0F, 0.0F);
		head.addChild(ear_r1);
		setRotationAngle(ear_r1, 0.7854F, 0.0F, 0.0F);
		ear_r1.texOffs(0, 31).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 5.0F, 5.0F, 0.0F, false);

		mustache_right = new ModelRenderer(this);
		mustache_right.setPos(4.0F, 0.5F, -5.1F);
		head.addChild(mustache_right);
		setRotationAngle(mustache_right, 0.0F, 0.0F, -0.3054F);
		mustache_right.texOffs(0, 55).addBox(-3.0F, -4.5F, -0.4F, 6.0F, 9.0F, 0.0F, 0.0F, true);

		mustache_right_r1_r1 = new ModelRenderer(this);
		mustache_right_r1_r1.setPos(2.75F, -3.5F, -0.05F);
		mustache_right.addChild(mustache_right_r1_r1);
		setRotationAngle(mustache_right_r1_r1, 0.0F, 0.0F, -0.3491F);
		mustache_right_r1_r1.texOffs(12, 55).addBox(-3.0F, -4.5F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);

		mustache_right_r1_r2 = new ModelRenderer(this);
		mustache_right_r1_r2.setPos(1.25F, -2.5F, -0.15F);
		mustache_right.addChild(mustache_right_r1_r2);
		setRotationAngle(mustache_right_r1_r2, 0.0F, 0.0F, -0.2182F);
		mustache_right_r1_r2.texOffs(12, 55).addBox(-3.0F, -4.5F, 0.0F, 6.0F, 9.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}