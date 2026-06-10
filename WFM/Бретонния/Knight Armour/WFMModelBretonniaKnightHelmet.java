// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBretonniaKnightHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone2;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer bone;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;

	public WFMModelBretonniaKnightHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(-0.0503F, -4.0F, -6.0503F);
		head.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -2.3562F, 0.0F);
		

		Head_r1 = new ModelRenderer(this);
		Head_r1.setPos(0.0F, 0.0F, 0.0F);
		bone2.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 1.1781F, 0.0F);
		Head_r1.texOffs(43, 48).addBox(0.0F, 4.91F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r1.texOffs(43, 48).addBox(0.0F, -4.09F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r1.texOffs(39, 43).addBox(0.0F, -4.1F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setPos(0.0F, 0.0F, 0.2003F);
		bone2.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 1.1781F, 0.0F);
		Head_r2.texOffs(39, 52).addBox(0.9239F, 0.9F, 0.3827F, 0.0F, 4.0F, 8.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-0.0503F, -4.0F, -6.0503F);
		head.addChild(bone);
		

		Head_r3 = new ModelRenderer(this);
		Head_r3.setPos(0.0F, 9.0F, 0.0F);
		bone.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 1.1781F, 0.0F);
		Head_r3.texOffs(43, 48).addBox(-1.0F, -4.1F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r3.texOffs(43, 48).addBox(-1.0F, -13.1F, 0.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);
		Head_r3.texOffs(39, 43).addBox(0.0F, -13.1F, 0.0F, 0.0F, 9.0F, 8.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setPos(0.0F, 0.0F, 0.2003F);
		bone.addChild(Head_r4);
		setRotationAngle(Head_r4, 0.0F, 1.1781F, 0.0F);
		Head_r4.texOffs(39, 52).addBox(0.0F, 0.9F, 0.0F, 0.0F, 4.0F, 8.0F, 0.0F, false);
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