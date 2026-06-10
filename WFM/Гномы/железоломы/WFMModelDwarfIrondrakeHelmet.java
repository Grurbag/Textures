// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfIrondrakeHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mustache_left;
	private final ModelRenderer mustache_left_r1_r1;
	private final ModelRenderer mustache_left_r1_r2;
	private final ModelRenderer mustache_left_r1_r3;
	private final ModelRenderer mustache_left_r1_r4;
	private final ModelRenderer mustache_left_r1_r5;
	private final ModelRenderer ear2_r1;
	private final ModelRenderer ear_r1;
	private final ModelRenderer mustache_right;
	private final ModelRenderer mustache_right_r1_r1;
	private final ModelRenderer mustache_right_r1_r2;
	private final ModelRenderer mustache_right_r1_r3;
	private final ModelRenderer mustache_right_r1_r4;
	private final ModelRenderer mustache_right_r1_r5;

	public WFMModelDwarfIrondrakeHelmet() {
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
		mustache_left.texOffs(3, 55).addBox(2.0F, 0.5F, -0.3F, 3.0F, 9.0F, 0.0F, 0.0F, false);

		mustache_left_r1_r1 = new ModelRenderer(this);
		mustache_left_r1_r1.setPos(0.6136F, 5.125F, -0.05F);
		mustache_left.addChild(mustache_left_r1_r1);
		setRotationAngle(mustache_left_r1_r1, 0.0F, 0.1309F, 0.0873F);
		mustache_left_r1_r1.texOffs(12, 58).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, true);

		mustache_left_r1_r2 = new ModelRenderer(this);
		mustache_left_r1_r2.setPos(0.1831F, 5.064F, 1.45F);
		mustache_left.addChild(mustache_left_r1_r2);
		setRotationAngle(mustache_left_r1_r2, -3.1416F, 1.4835F, -3.098F);
		mustache_left_r1_r2.texOffs(12, 58).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 0.0F, 0.0F, true);

		mustache_left_r1_r3 = new ModelRenderer(this);
		mustache_left_r1_r3.setPos(-0.3169F, 0.064F, 1.45F);
		mustache_left.addChild(mustache_left_r1_r3);
		setRotationAngle(mustache_left_r1_r3, -3.1416F, 1.4835F, -3.098F);
		mustache_left_r1_r3.texOffs(12, 58).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 0.0F, 0.0F, true);

		mustache_left_r1_r4 = new ModelRenderer(this);
		mustache_left_r1_r4.setPos(-0.3169F, 0.064F, -0.05F);
		mustache_left.addChild(mustache_left_r1_r4);
		setRotationAngle(mustache_left_r1_r4, 0.0F, 0.1309F, 0.0436F);
		mustache_left_r1_r4.texOffs(12, 58).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, true);

		mustache_left_r1_r5 = new ModelRenderer(this);
		mustache_left_r1_r5.setPos(1.5F, 0.0F, -0.4F);
		mustache_left.addChild(mustache_left_r1_r5);
		setRotationAngle(mustache_left_r1_r5, -0.0436F, 0.0F, 0.0F);
		mustache_left_r1_r5.texOffs(3, 55).addBox(-1.5F, -4.5F, 0.0F, 3.0F, 9.0F, 0.0F, 0.0F, false);

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
		mustache_right.texOffs(3, 55).addBox(-5.0F, 0.5F, -0.3F, 3.0F, 9.0F, 0.0F, 0.0F, true);

		mustache_right_r1_r1 = new ModelRenderer(this);
		mustache_right_r1_r1.setPos(-0.6136F, 5.125F, -0.05F);
		mustache_right.addChild(mustache_right_r1_r1);
		setRotationAngle(mustache_right_r1_r1, 0.0F, -0.1309F, -0.0873F);
		mustache_right_r1_r1.texOffs(12, 58).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, false);

		mustache_right_r1_r2 = new ModelRenderer(this);
		mustache_right_r1_r2.setPos(-0.1831F, 5.064F, 1.45F);
		mustache_right.addChild(mustache_right_r1_r2);
		setRotationAngle(mustache_right_r1_r2, -3.1416F, -1.4835F, 3.098F);
		mustache_right_r1_r2.texOffs(12, 58).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 0.0F, 0.0F, false);

		mustache_right_r1_r3 = new ModelRenderer(this);
		mustache_right_r1_r3.setPos(0.3169F, 0.064F, 1.45F);
		mustache_right.addChild(mustache_right_r1_r3);
		setRotationAngle(mustache_right_r1_r3, -3.1416F, -1.4835F, 3.098F);
		mustache_right_r1_r3.texOffs(12, 58).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 6.0F, 0.0F, 0.0F, false);

		mustache_right_r1_r4 = new ModelRenderer(this);
		mustache_right_r1_r4.setPos(0.3169F, 0.064F, -0.05F);
		mustache_right.addChild(mustache_right_r1_r4);
		setRotationAngle(mustache_right_r1_r4, 0.0F, -0.1309F, -0.0436F);
		mustache_right_r1_r4.texOffs(12, 58).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 0.0F, 0.0F, false);

		mustache_right_r1_r5 = new ModelRenderer(this);
		mustache_right_r1_r5.setPos(-1.5F, 0.0F, -0.4F);
		mustache_right.addChild(mustache_right_r1_r5);
		setRotationAngle(mustache_right_r1_r5, -0.0436F, 0.0F, 0.0F);
		mustache_right_r1_r5.texOffs(3, 55).addBox(-1.5F, -4.5F, 0.0F, 3.0F, 9.0F, 0.0F, 0.0F, true);
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