// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevIceGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;

	public WFMModelKislevIceGuardHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.texOffs(42, 53).addBox(3.25F, -5.75F, -3.5F, 3.0F, 3.0F, 8.0F, 0.0F, false);
		Head.texOffs(52, 47).addBox(2.5F, -6.5F, -5.25F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Head.texOffs(52, 47).addBox(2.5F, -5.0F, 2.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Head.texOffs(52, 47).addBox(-5.5F, -5.0F, 2.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		Head.texOffs(42, 53).addBox(-6.25F, -5.75F, -3.5F, 3.0F, 3.0F, 8.0F, 0.0F, true);
		Head.texOffs(52, 47).addBox(-5.5F, -6.5F, -5.25F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		Head.texOffs(42, 41).addBox(-4.0F, -4.0F, 3.25F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		Head.texOffs(42, 41).addBox(-4.0F, -8.0F, -5.75F, 8.0F, 3.0F, 3.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -6.5F, -6.5F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, -0.0436F, 0.0436F, 0.7854F);
		head_r1.texOffs(27, 61).addBox(-1.5F, -1.5F, 0.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -8.0F, 1.0F);
		Head.addChild(head_r2);
		setRotationAngle(head_r2, -0.0869F, 0.0152F, 0.0862F);
		head_r2.texOffs(0, 36).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r3);
		setRotationAngle(head_r3, -0.1745F, 0.0F, 0.1745F);
		head_r3.texOffs(0, 22).addBox(-2.5F, -2.85F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r4);
		setRotationAngle(head_r4, -0.3444F, -0.0036F, 0.1403F);
		head_r4.texOffs(24, 25).addBox(-1.0F, -3.6F, -2.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}