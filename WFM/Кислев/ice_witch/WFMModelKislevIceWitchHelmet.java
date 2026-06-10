// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelKislevIceWitchHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer visulki;
	private final ModelRenderer group2;
	private final ModelRenderer group;
	private final ModelRenderer group3;
	private final ModelRenderer group4;

	public WFMModelKislevIceWitchHelmet() {
		texWidth = 128;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(33, 20).addBox(-4.0F, -8.0F, -3.0F, 8.0F, 9.0F, 7.0F, 0.3F, false);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, -6.5F, -6.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.0436F, 0.0436F, 0.7854F);
		head_r1.texOffs(27, 61).addBox(-1.5F, -1.5F, 0.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, -8.0F, 1.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.0869F, 0.0152F, 0.0862F);
		head_r2.texOffs(0, 36).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(0.0F, -8.3279F, 0.9924F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.1745F, 0.0F, 0.1745F);
		head_r3.texOffs(0, 22).addBox(-2.5F, -2.85F, -3.5F, 5.0F, 2.0F, 5.0F, -0.2F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(0.0F, -8.3279F, 0.9924F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.3444F, -0.0036F, 0.1403F);
		head_r4.texOffs(24, 25).addBox(-1.0F, -3.6F, -2.5F, 2.0F, 2.0F, 2.0F, -0.1F, false);

		visulki = new ModelRenderer(this);
		visulki.setPos(2.5F, 25.0F, -0.6F);
		head.addChild(visulki);
		visulki.texOffs(29, 0).addBox(-1.0F, -32.0F, -4.0F, 5.0F, 8.0F, 0.0F, 0.0F, false);
		visulki.texOffs(29, 0).addBox(-9.0F, -32.0F, -4.0F, 5.0F, 8.0F, 0.0F, 0.0F, false);

		group2 = new ModelRenderer(this);
		group2.setPos(2.5F, -30.5F, 0.6F);
		visulki.addChild(group2);
		setRotationAngle(group2, -1.5708F, -1.309F, 1.5708F);
		group2.texOffs(106, 0).addBox(-5.5F, -4.5F, 0.0F, 11.0F, 9.0F, 0.0F, 0.0F, false);

		group = new ModelRenderer(this);
		group.setPos(-2.5F, -31.5F, -4.4F);
		visulki.addChild(group);
		setRotationAngle(group, 0.0873F, 0.0F, 0.0F);
		group.texOffs(106, 0).addBox(-5.5F, -4.5F, 0.0F, 11.0F, 9.0F, 0.0F, 0.0F, false);

		group3 = new ModelRenderer(this);
		group3.setPos(-7.5F, -30.5F, 0.6F);
		visulki.addChild(group3);
		setRotationAngle(group3, -1.5708F, -1.309F, 1.5708F);
		group3.texOffs(106, 0).addBox(-5.5F, -4.5F, 0.0F, 11.0F, 9.0F, 0.0F, 0.0F, false);

		group4 = new ModelRenderer(this);
		group4.setPos(-2.5F, -28.6329F, 5.8409F);
		visulki.addChild(group4);
		setRotationAngle(group4, -0.2618F, 0.0F, 0.0F);
		group4.texOffs(106, 0).addBox(-5.5F, -4.5F, 0.0F, 11.0F, 9.0F, 0.0F, 0.0F, false);
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